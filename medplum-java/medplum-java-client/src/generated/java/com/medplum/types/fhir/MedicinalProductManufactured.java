package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  String resourceType();

  Optional<List<CodeableConcept>> otherCharacteristics();

  Optional<List<Reference>> manufacturer();

  Optional<List<Reference>> ingredient();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Quantity quantity();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept manufacturedDoseForm();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> unitOfPresentation();

  Optional<ProdCharacteristic> physicalCharacteristics();

  static ImmutableMedicinalProductManufactured.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductManufactured.builder();
  }
}
