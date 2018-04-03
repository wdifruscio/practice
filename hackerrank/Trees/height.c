
/*The tree node has data, left child and right child 
class Node {
    int data;
    Node* left;
    Node* right;
};
*/
int height(Node *root)
{
    int left = 0;
    int right = 0;
    if (root->left)
    {
        left += 1 + height(root->left);
    }
    if (root->right)
    {
        right += 1 + height(root->right);
    }

    if (left > right)
    {
        return left;
    }
    else if (right > left)
    {
        return right;
    }
    else
    {
        return 0;
    }
}
