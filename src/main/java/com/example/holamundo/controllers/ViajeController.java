package com.example.holamundo.controllers;

import com.example.holamundo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/viaje")
public class ViajeController {
    
    @Autowired
    ViajeRepository viajeRepository;

    @GetMapping({"/",""})
    public String listaViajesProgramados(Model model, @RequestParam(required = false) String zona) {
        model.addAttribute("listaViajes", viajeRepository.findAll());
        return "viaje/list";
    }

    /*
    @GetMapping(value = "new")
    public String nuevoProductoFrm(Model model, @ModelAttribute("product") Product product) {
        List<Category> listaCategorias = categoryRepository.findAll();
        List<Supplier> listaProveedores = supplierRepository.findAll();
        List<OrderDetails> orderDetailsList = orderDetailsRepository.findAll();

        model.addAttribute("listaCategorias", listaCategorias);
        model.addAttribute("listaProveedores", listaProveedores);
        //model.addAttribute("listaOrderDetails", listaOrderDetailsm);
        return "product/newFrm";
    }


    @GetMapping("/edit")
    public String editarProducto(@ModelAttribute("product") Product product, Model model, @RequestParam("id") int id) {
        Optional<Product> optProduct = productRepository.findById(id);
        if (optProduct.isPresent()) {
            product = optProduct.get();
            model.addAttribute("product", product);
            model.addAttribute("listaCategorias", categoryRepository.findAll());
            model.addAttribute("listaProveedores", supplierRepository.findAll());
            model.addAttribute("listaOrderDetails", orderDetailsRepository.findAll());

            return "product/newFrm";
        } else {
            return "redirect:/product";
        }
    }



    @PostMapping("/save")
    public String guardarProducto(RedirectAttributes attr,
                                  Model model,
                                  @ModelAttribute("product") @Valid Product product,
                                  BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            model.addAttribute("listaCategorias", categoryRepository.findAll());
            model.addAttribute("listaProveedores", supplierRepository.findAll());
            return "product/newFrm";
        }else{
            if (product.getId() == 0) {
                List<Product> productList = productRepository.findByProductname(product.getProductname());
                boolean existe = false;
                for (Product p : productList) {
                    if (p.getProductname().equals(product.getProductname())) {
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    System.out.println("El producto existe");
                    model.addAttribute("listaCategorias", categoryRepository.findAll());
                    model.addAttribute("listaProveedores", supplierRepository.findAll());
                    return "product/newFrm";
                } else {
                    attr.addFlashAttribute("msg", "Producto creado exitosamente");
                    productRepository.save(product);
                    return "redirect:/product";
                }
            } else {
                attr.addFlashAttribute("msg", "Producto actualizado exitosamente");
                productRepository.save(product);
                return "redirect:/product";
            }
        }
    }


    @GetMapping("/delete")
    public String borrarTransportista(Model model,
                                        @RequestParam("id") int id,
                                        RedirectAttributes attr) {

        Optional<Product> optProduct = productRepository.findById(id);

        if (optProduct.isPresent()) {
            productRepository.deleteById(id);
            attr.addFlashAttribute("msg", "Producto borrado exitosamente");
        }
        return "redirect:/product";
        }
     */







}
