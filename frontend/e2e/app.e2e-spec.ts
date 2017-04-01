import { Av4secPage } from './app.po';

describe('av4sec App', function() {
  let page: Av4secPage;

  beforeEach(() => {
    page = new Av4secPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
