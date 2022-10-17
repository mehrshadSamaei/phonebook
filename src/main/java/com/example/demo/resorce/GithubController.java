package com.example.demo.resorce;

import com.example.demo.dto.githubdto.GithubRequestDTO;
import com.example.demo.dto.githubdto.GithubResponseDTO;
import com.example.demo.dto.root.GitHubRootDTO;
import com.example.demo.dto.search.GithubSearch;
import com.example.demo.service.GithubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/github")
public class GithubController {
    private final GithubService githubService;

    public GithubController(GithubService githubService) {
        this.githubService = githubService;
    }
    @GetMapping("find-github")
    public ResponseEntity<GithubResponseDTO> findById(@RequestParam Long id){
        GithubResponseDTO githubResponseDTO = githubService.findById(id).get();
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
    @GetMapping("all-githubs")
    public ResponseEntity<List<GithubResponseDTO>> findAllGithub(){
        return ResponseEntity.ok(
                githubService.findAll()
        );
    }
    @PostMapping
    public ResponseEntity<List<GitHubRootDTO>> findAllPagination(@RequestBody GithubSearch githubSearch){
        return ResponseEntity.ok(
                githubService.findAllByAdvanceSearch(githubSearch)
        );
    }
}
