<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Task Form</title>
  <!-- Bootstrap CSS -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jersey+15&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Rubik+Vinyl&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
 <style>
    h2 {
  font-family: "Jersey 15", serif;
  font-weight: 400;
  font-style: normal;
    }
  </style>
</head>
<body>

  <div class="container mt-5">
  
    <h2 class="text-center mb-4 font">Add a New Note</h2>
    
    <form action="NoteSaverServlet" method="post">
      <div class="mb-3">
        <label for="taskTitle" class="form-label">Note Title</label>
        <input type="text" name="title"class="form-control" id="taskTitle" placeholder="Enter Note title" required>
      </div>
      <div class="mb-3">
        <label for="taskDescription" class="form-label">Note Description</label>
        <textarea class="form-control" name="content"id="taskDescription" rows="3" placeholder="Enter Note description" required></textarea>
      </div>
       <div class="d-flex justify-content-center">
        <button type="submit" class="btn btn-primary">Add</button>
      </div>
    </form>
  </div>

  <!-- Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
