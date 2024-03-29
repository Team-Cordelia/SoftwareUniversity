function countDivs(html) {
    var counter = 0;
    var word = '<div';
    var index = html.indexOf(word);
    while (index !== -1) {
        index = html.indexOf(word, index + 1);
        counter++;
    }
    return counter;
}

console.log(countDivs('<!DOCTYPE html>' +
    '<html>' +
    '<head lang="en">' +
    '<meta charset="UTF-8">' +
    '<title>index</title>' +
    '<script src="/yourScript.js" defer></script>' +
    '</head>' +
    '<body>' +
    '<div id="outerDiv">' +
    '<div' +
    'class="first">' +
    '<div><div>hello</div></div>' +
    '</div>' +
    '<div>hi<div></div></div>' +
    '<div>I am a div</div>' +
    '</div>' +
    '</body>' +
    '</html>'));