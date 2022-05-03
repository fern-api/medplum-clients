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
  Optional<List<Reference>> parent();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<BiologicallyDerivedProduct_Storage>> storage();

  String resourceType();

  Optional<BiologicallyderivedproductStatus> status();

  Optional<CodeableConcept> productCode();

  Optional<List<BiologicallyDerivedProduct_Processing>> processing();

  Optional<Id> id();

  Optional<Integer> quantity();

  Optional<BiologicallyderivedproductProductcategory> productCategory();

  Optional<List<Extension>> modifierExtension();

  Optional<BiologicallyDerivedProduct_Manipulation> manipulation();

  Optional<BiologicallyDerivedProduct_Collection> collection();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<List<Reference>> request();

  Optional<Uri> implicitRules();

  static ImmutableBiologicallyDerivedProduct.ResourceTypeBuildStage builder() {
    return ImmutableBiologicallyDerivedProduct.builder();
  }
}
