package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMedicinalProductManufactured.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductManufactured {
  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<Reference>> ingredient();

  Optional<List<CodeableConcept>> otherCharacteristics();

  CodeableConcept manufacturedDoseForm();

  Optional<Meta> meta();

  Quantity quantity();

  Optional<Narrative> text();

  Optional<id> id();

  Optional<uri> implicitRules();

  Optional<ProdCharacteristic> physicalCharacteristics();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<List<Reference>> manufacturer();

  Optional<CodeableConcept> unitOfPresentation();

  static ImmutableMedicinalProductManufactured.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductManufactured.builder();
  }
}
