package np.roshanadh.inventoryservice.controller;

import lombok.RequiredArgsConstructor;
import np.roshanadh.inventoryservice.dto.InventoryResponse;
import np.roshanadh.inventoryservice.model.Inventory;
import np.roshanadh.inventoryservice.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

  private final InventoryService inventoryService;

  @GetMapping("/isInStock")
  @ResponseStatus(HttpStatus.OK)
  public List<Inventory> isInStock(@RequestParam("skuCode") List<String> skuCodeList) {
    return inventoryService.isInStock(skuCodeList);
  }
}
