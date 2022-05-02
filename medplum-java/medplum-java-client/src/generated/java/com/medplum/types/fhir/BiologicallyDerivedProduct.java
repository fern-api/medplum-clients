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
  Optional<BiologicallyderivedproductProductcategory> productCategory();

  Optional<BiologicallyderivedproductStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> productCode();

  Optional<List<BiologicallyDerivedProduct_Processing>> processing();

  Optional<Id> id();

  Optional<BiologicallyDerivedProduct_Manipulation> manipulation();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<BiologicallyDerivedProduct_Collection> collection();

  Optional<Narrative> text();

  Optional<List<Reference>> parent();

  Optional<List<BiologicallyDerivedProduct_Storage>> storage();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> request();

  Optional<Integer> quantity();

  String resourceType();

  Optional<Meta> meta();

  static ImmutableBiologicallyDerivedProduct.ResourceTypeBuildStage builder() {
    return ImmutableBiologicallyDerivedProduct.builder();
  }
}
