<html>
<head>
<title>Survey Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<div class="container-mt 5">
   <div class="card shadow-lg p-4 rounded-4 w-50 mx-auto">
       <h2 class="text-center text-primary">Survey Details</h2>

       <form action="survey" method="post">

           <div class="mb-3">
               <label class="form-label">Name</label>
               <input type="text" name="name" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Occupatation</label>
               <input type="text" name="occupatation" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Education</label>
               <input type="text" name="education" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Native Place</label>
               <input type="text" name="nativePlace" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Father Name</label>
               <input type="text" name="fathername" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Mother Name</label>
               <input type="text" name="mothername" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Gender</label>
               <select name="gender" class="form-select">
                   <option>Choose...</option>
                   <option>Male</option>
                   <option>Female</option>
                   <option>Other</option>
               </select>
           </div>

           <div class="mb-3">
               <label class="form-label">Married</label>
               <select name="married" class="form-select">
                   <option>Choose...</option>
                   <option value="yes">Yes</option>
                   <option value="no">No</option>
               </select>
           </div>

           <div class="mb-3">
               <label class="form-label">Wife/Husband Name</label>
               <input type="text" name="whname" class="form-control">
           </div>

           <div class="col-md-6">
               <label class="form-label">Age</label>
               <input type="number" name="age" class="form-control" min="0">
           </div>

           <div class="mb-3">
               <label class="form-label">Date of Birth</label>
               <input type="date" name="date" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Height</label>
               <input type="text" name="height" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Weight</label>
               <input type="text" name="weight" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Blood Group</label>
               <input type="text" name="bloodGroup" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Bike Number</label>
               <input type="text" name="bikeNumber" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Car Number</label>
               <input type="text" name="carNumber" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Mobile Number</label>
               <input type="text" name="MobileNo" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Adhar Number</label>
               <input type="text" name="adharno" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">PanCard Number</label>
               <input type="text" name="panCard" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Voter Id </label>
               <input type="text" name="voterId" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Passport Number</label>
               <input type="text" name="passPort" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Ration Card Number</label>
               <input type="text" name="rationCard" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Income</label>
               <input type="text" name="income" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Bank Account</label>
               <input type="text" name="bankAccount" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">No. of Cycle</label>
               <input type="text" name="cycle" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">No. of Family member</label>
               <input type="text" name="member" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Insurance Company</label>
               <input type="text" name="insurance" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Insurance No</label>
               <input type="text" name="insuranceNo" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Laptop Model</label>
               <input type="text" name="laptop" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Tv Model</label>
               <input type="text" name="tv" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Land In Acres</label>
               <input type="text" name="land" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Total Sites</label>
               <input type="text" name="sites" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">RTC No</label>
               <input type="text" name="rtcNo" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Taxes Paid</label>
               <input type="text" name="taxes" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Govt Employee</label>
               <input type="text" name="employee" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Disabled</label>
               <input type="text" name="disabled" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Caste</label>
               <input type="text" name="caste" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Religion</label>
               <input type="text" name="religion" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Mother Tongue</label>
               <input type="text" name="motherTongue" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Shoe size</label>
               <input type="text" name="shoeSize" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">No. of Shoes</label>
               <input type="text" name="noOfShoes" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Friend Name</label>
               <input type="text" name="friendname" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Electricity Bill No</label>
               <input type="text" name="electricity" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Water Bill No</label>
               <input type="text" name="water" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Building Ower Name</label>
               <input type="text" name="buildingOwerName" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Crop</label>
               <input type="text" name="crop" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Loan No</label>
               <input type="text" name="loanNo" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Loan Balance</label>
               <input type="text" name="loanBalance" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Loan Type</label>
               <input type="text" name="loanType" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Gold In gms</label>
               <input type="text" name="gold" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Silver in gms</label>
               <input type="text" name="silver" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Pet Name</label>
               <input type="text" name="petName" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">No. of Cows</label>
               <input type="text" name="cows" class="form-control">
           </div>

           <div class="mb-3">
               <label class="form-label">Share Holding</label>
               <input type="text" name="shareHolding" class="form-control">
           </div>

           <button class="btn btn-primary w-70">Submit</button>
       </form>
</div>
</div>
</body>
</html>