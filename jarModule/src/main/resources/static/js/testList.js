var testList = [];

$(document).ready(function() {
    initSetting();
})

function initSetting() {
    testList = result.data;
    console.log(testList);
    createTable(testList);
}

function createTable(list) {
    let html;
    list.forEach((data, index) => {
        html += `<tr>
            <td>
                <input id="${data.testListId}" type="checkbox" />
            </td>
            <td>${data.testType}</td>
            <td>${data.testNm}</td>
            <td>${data.testCycl}</td>
            <td>${data.testTime}</td>
            <td>${data.rgstDttm}</td>
            <td>${data.userId}</td>
        </tr>`
    })
    $('#testList').append(html);

}