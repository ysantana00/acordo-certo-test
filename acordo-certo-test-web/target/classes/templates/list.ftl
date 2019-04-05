<div class="generic-container">
  <div class="panel panel-default">
    <div class="panel-heading"><span class="lead">Usuario Acordo Certo </span></div>
    <div class="panel-body">
      <div class="formcontainer">
        <div
          class="alert alert-success"
          role="alert"
          ng-if="ctrl.successMessage">{{ctrl.successMessage}}
        </div>
        <div
          class="alert alert-danger"
          role="alert"
          ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}
        </div>
        <form
          ng-submit="ctrl.submit()"
          name="myForm"
          class="form-horizontal">
          <input
            type="hidden"
            ng-model="ctrl.usuario.id" />
          <div class="row">
            <div class="form-group col-md-12">
              <label
                class="col-md-2 control-lable"
                for="uname">Nome</label>
              <div class="col-md-7">
                <input
                  type="text"
                  ng-model="ctrl.usuario.nome"
                  id="uname"
                  class="username form-control input-sm"
                  placeholder="Nome"
                  required
                  ng-minlength="3" />
              </div>
            </div>
          </div>

          <div class="row">
            <div class="form-group col-md-12">
              <label
                class="col-md-2 control-lable"
                for="email">Email</label>
              <div class="col-md-7">
                <input
                  type="text"
                  ng-model="ctrl.usuario.email"
                  id="email"
                  class="form-control input-sm"
                  placeholder="Email"
                  required />
              </div>
            </div>
          </div>

          <div class="row">
            <div class="form-group col-md-12">
              <label
                class="col-md-2 control-lable"
                for="salary">Telefone</label>
              <div class="col-md-7">
                <input
                  type="text"
                  ng-model="ctrl.usuario.telefone"
                  id="salary"
                  class="form-control input-sm"
                  placeholder="Telefone"
                  required
                  ng-pattern="ctrl.onlyNumbers" />
              </div>
            </div>
          </div>

          <div class="row">
            <div class="form-group col-md-12">
              <label
                class="col-md-2 control-lable"
                for="estado">Estado</label>
              <div class="col-md-7">
                <select
                  class="form-control"
                  id="exampleFormControlSelect1"
                  ng-model="ctrl.usuario.estado">
                  <option
                    ng-repeat="estado in ctrl.estados"
                    value="{{estado}}">{{estado}}
                  </option>
                </select>
              </div>
            </div>
          </div>

          <div class="row">
            <div class="form-group col-md-12">
              <label
                class="col-md-2 control-lable"
                for="ativo">Ativo</label>
              <input
                type="checkbox"
                ng-model="ctrl.usuario.indAtivo"
                [name="indAtivo"
                ]
                [ng-true-value="true"
                ]
                [ng-false-value="false"
                ]
                ]>
            </div>
          </div>

      <div class="row">
        <div class="form-actions floatRight">
          <input
            type="submit"
            value="{{'Add'}}"
            class="btn btn-primary btn-sm"
            ng-disabled="myForm.$invalid || myForm.$pristine">
          <button
            type="button"
            ng-click="ctrl.reset()"
            class="btn btn-warning btn-sm"
            ng-disabled="myForm.$pristine">Reset Form
          </button>
        </div>
      </div>
      </form>
    </div>
  </div>
</div>
    <div class="panel panel-default">
      <!-- Default panel contents -->
      <div class="panel-heading"><span class="lead">Lista de Usuários Acordo Certo </span></div>
      <div class="panel-body">
        <div class="table-responsive">
          <table class="table table-hover">
            <thead>
            <tr>
              <th>NOME</th>
              <th>EMAIL</th>
              <th>TELEFONE</th>
              <th>ESTADO</th>
              <th width="100"></th>
              <th width="100"></th>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="u in ctrl.getAllUsers()">
              <td>{{u.nome}}</td>
              <td>{{u.email}}</td>
              <td>{{u.telefone}}</td>
              <td>{{u.estado}}</td>
              <td>
                <button
                  type="button"
                  ng-click="ctrl.removeUser(u.id)"
                  class="btn btn-danger custom-width">Remove
                </button>
              </td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
</div>