const $createDialog = document.querySelector(".zazdent-create-dialog");
const $updateDialog = document.querySelector(".zazdent-update-dialog");
const $deleteDialog = document.querySelector(".zazdent-delete-dialog");

const $openCreateDialogBtn = document.querySelector(".open-create-dialog");
const $openUpdateDialogBtn = document.querySelector(".open-update-dialog");
const $openDeleteDialogBtn = document.querySelector(".open-delete-dialog");

$openCreateDialogBtn.addEventListener("click", () => {
  $createDialog.showModal();
});

$openUpdateDialogBtn.addEventListener("click", () => {
  $updateDialog.showModal();
});

$openDeleteDialogBtn.addEventListener("click", () => {
  $deleteDialog.showModal();
});
