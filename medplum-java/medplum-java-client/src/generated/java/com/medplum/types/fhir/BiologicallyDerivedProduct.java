package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> productCode();

  String resourceType();

  Optional<BiologicallyDerivedProduct_Manipulation> manipulation();

  Optional<List<BiologicallyDerivedProduct_Storage>> storage();

  Optional<BiologicallyderivedproductProductcategory> productCategory();

  Optional<List<BiologicallyDerivedProduct_Processing>> processing();

  Optional<Meta> meta();

  Optional<BiologicallyDerivedProduct_Collection> collection();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> quantity();

  Optional<Code> language();

  Optional<List<Reference>> parent();

  Optional<List<Reference>> request();

  Optional<Narrative> text();

  Optional<BiologicallyderivedproductStatus> status();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  static ImmutableBiologicallyDerivedProduct.ResourceTypeBuildStage builder() {
    return ImmutableBiologicallyDerivedProduct.builder();
  }
}
