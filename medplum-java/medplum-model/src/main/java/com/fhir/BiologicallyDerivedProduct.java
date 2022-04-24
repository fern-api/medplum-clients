package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBiologicallyDerivedProduct.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BiologicallyDerivedProduct {
  Optional<List<BiologicallyDerivedProduct_Processing>> processing();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> productCode();

  Optional<Meta> meta();

  Optional<List<Reference>> parent();

  Optional<code> language();

  Optional<List<Extension>> extension();

  Optional<uri> implicitRules();

  Optional<Integer> quantity();

  Optional<BiologicallyDerivedProduct_Collection> collection();

  Optional<List<BiologicallyDerivedProduct_Storage>> storage();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> request();

  Optional<Narrative> text();

  String resourceType();

  Optional<BiologicallyderivedproductProductcategory> productCategory();

  Optional<id> id();

  Optional<BiologicallyderivedproductStatus> status();

  Optional<BiologicallyDerivedProduct_Manipulation> manipulation();

  Optional<List<Extension>> modifierExtension();

  static ImmutableBiologicallyDerivedProduct.ResourceTypeBuildStage builder() {
    return ImmutableBiologicallyDerivedProduct.builder();
  }
}
