const ProveedoresController = require("../controllers/proveedores.controller");
const route = require("../config/middleware");

module.exports = function (router) {
  router.post("/proveedores", route.protected, ProveedoresController.create);
  router.get("/proveedores", route.protected, ProveedoresController.getAll);
  router.get("/proveedores/:id", route.protected, ProveedoresController.get);
  router.put("/proveedores/:id", route.protected, ProveedoresController.update);
  router.delete("/proveedores/:id", route.protected, ProveedoresController.delete);
};
