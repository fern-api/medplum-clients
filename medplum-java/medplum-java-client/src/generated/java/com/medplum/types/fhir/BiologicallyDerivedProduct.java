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
  Optional<List<Reference>> request();

  Optional<Meta> meta();

  Optional<BiologicallyDerivedProduct_Manipulation> manipulation();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Integer> quantity();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> parent();

  Optional<List<BiologicallyDerivedProduct_Processing>> processing();

  Optional<BiologicallyderivedproductStatus> status();

  Optional<CodeableConcept> productCode();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<BiologicallyDerivedProduct_Collection> collection();

  Optional<List<BiologicallyDerivedProduct_Storage>> storage();

  Optional<List<Extension>> modifierExtension();

  Optional<BiologicallyderivedproductProductcategory> productCategory();

  static ImmutableBiologicallyDerivedProduct.ResourceTypeBuildStage builder() {
    return ImmutableBiologicallyDerivedProduct.builder();
  }
}
