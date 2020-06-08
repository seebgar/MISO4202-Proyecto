const ProductosController = require("../controllers/productos.controller");
const route = require("../config/middleware");

module.exports = function (router) {
  router.post("/productos", route.protected, ProductosController.create);
  router.get("/productos", route.protected, ProductosController.getAll);
  router.get("/productos/:id", route.protected, ProductosController.get);
  router.put("/productos/:id", route.protected, ProductosController.update);
  router.delete("/productos/:id", route.protected, ProductosController.delete);
};
