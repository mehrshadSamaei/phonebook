package com.example.demo.resorce;
import com.example.demo.dto.githubdto.GithubRequestDTO;
import com.example.demo.dto.githubdto.GithubResponseDTO;
import com.example.demo.dto.search.GithubSearch;
import com.example.demo.service.GithubService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/github")
public class GithubController {
    private final GithubService githubService;

    public GithubController(GithubService githubService) {
        this.githubService = githubService;
    }
    @GetMapping("find-github")
    public ResponseEntity<GithubResponseDTO> findById(@RequestParam Long id){
        GithubResponseDTO githubResponseDTO = githubService.findById(id);
        return ResponseEntity.ok(
                githubResponseDTO
        );
    }
    @PostMapping("/save-github")
    public ResponseEntity<GithubResponseDTO> saveGithub(@RequestBody GithubRequestDTO githubRequestDTO){
        GithubResponseDTO githubResponseDTO = githubService.save(githubRequestDTO);
        return ResponseEntity.ok(
                githubResponseDTO
        );
    }
    @PutMapping
    public ResponseEntity<GithubResponseDTO> updateGithubInfo(@RequestBody GithubRequestDTO githubRequestDTO){
        return ResponseEntity.ok(
                githubService.update(githubRequestDTO)
        );
    }
    @GetMapping("all-github")
    public ResponseEntity<List<GithubResponseDTO>> findAllGithub(){
        return ResponseEntity.ok(
                githubService.findAll()
        );
    }
    @PostMapping
    public ResponseEntity<List<GithubResponseDTO>> findAllPagination(@RequestBody GithubSearch githubSearch){
        return ResponseEntity.ok(
                githubService.findAllByAdvanceSearch(githubSearch)
        );
    }
    @GetMapping("/{username}")
    public String getGithubRepositories(@PathVariable("username") String username) throws JSONException {
        RestTemplate restTemplate = new RestTemplate();
        String githubUrl = "https://api.github.com/users/" + username + "/repos";
        ResponseEntity<String> gitHubResponse =
                restTemplate.getForEntity(githubUrl , String.class);
        JSONArray jsonArray = new JSONArray(gitHubResponse.getBody());
        try {
            List<String> repositoryListName = IntStream.range(0, jsonArray.length()).mapToObj(index -> ((JSONObject) jsonArray.get(index)).getString("name")).collect(Collectors.toList());
            for (String name : repositoryListName
            ) {
                System.out.println(name);
            }

        }catch (JSONException e){
            e.getStackTrace();
        }

        return "success";
    }
}
