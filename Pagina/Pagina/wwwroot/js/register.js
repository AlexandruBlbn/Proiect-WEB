<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    function loadFaculties() {
        var university = $('#University').val();
        $.get('/Register?handler=FacultiesForUniversity', { university: university }, function (data) {
            var facultySelect = $('#Faculty');
            facultySelect.empty();
            facultySelect.append('<option value="" disabled selected>Select faculty</option>');
            $.each(data, function (index, item) {
                facultySelect.append('<option value="' + item.Name + '">' + item.Name + '</option>');
            });
        });
    }

    function loadSpecializations() {
        var faculty = $('#Faculty').val();
        $.get('/Register?handler=SpecializationsForFaculty', { faculty: faculty }, function (data) {
            var specializationSelect = $('#Specialization');
            specializationSelect.empty();
            specializationSelect.append('<option value="" disabled selected>Select specialization</option>');
            $.each(data, function (index, item) {
                specializationSelect.append('<option value="' + item.Name + '">' + item.Name + '</option>');
            });
        });
    }
</script>