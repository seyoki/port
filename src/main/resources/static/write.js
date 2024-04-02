//파일선택
function selectFile(element){
    const file =element.files[0];
    const filename=element.closest('.file_input').firstElementChild;
    //.파일선택 창에서 취소버튼
    if(!file){
        filename.value='';
        return false;
    }
    //2.파일크기가 10mb초과
    const fileSize= Math.floor(file.size/1024/1024);
    if(fileSize>10){
        alert('10mb 이하의 파일로 업로드해주세요.');
        filename.value='';
        element.value='';
        return false;
    }
    //3.file name save
    filename.value= file.name;
}
   // 파일 추가
   function addFile() {
    const fileDiv = document.createElement('div');
    fileDiv.innerHTML =`
        <div class="file_input">
            <input type="text" readonly />
            <label> 첨부파일
                <input type="file" name="files" onchange="selectFile(this);" />
            </label>
        </div>
        <button type="button" onclick="removeFile(this);" class="btns del_btn"><span>삭제</span></button>
    `;
    document.querySelector('.file_list').appendChild(fileDiv);
}

출처: https://congsong.tistory.com/39 [Let's develop:티스토리]
//파일 삭제
function removeFile(element){
    const fileAddBtn =element.nextElementSibling;
    if(fileAddBtn){
        const inputs =element.previousElementSibling.querySelectorAll('input');
        inputs.forEach(input=>input.value='')
        return false;
    }
    element.parentElement.remove();
}