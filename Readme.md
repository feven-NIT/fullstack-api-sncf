# Sncf api quarkus kafka

This repo contains the material to deploy quarkus and kafka via argoCD applications.



## Deploy ArgoCD, cluster-wide subscriptions and create namespaces (in the gitops version we have now, we can't add labels when they are created by ArgoCD)
```shell
oc apply -f gitops/sub.yaml
oc apply -f gitops/ns.yaml
oc apply -f gitops/rbac.yaml
oc delete clusterrolebinding self-provisioners
```

## Configure the sncf project

Create the argoCD headquarter project
```shell
oc apply -f sncf/argocd/project.yaml
```

Create the argoCD Application
```shell
oc apply -f sncf/argocd/application.yaml
```

