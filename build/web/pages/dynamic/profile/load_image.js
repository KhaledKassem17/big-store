    function readUrl(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();
            reader.onload = function(e) {
                $("#pr-img")
                        .attr('src', e.target.result)
                        .width(350)
                        .height(350);
            };
            reader.readAsDataURL(input.files[0]);


        }
    }
    ;



