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
    as = ImmutableSpecimenDefinition_Container.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition_Container {
  Optional<Quantity> capacity();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<String> minimumVolumeString();

  Optional<Quantity> minimumVolumeQuantity();

  Optional<CodeableConcept> material();

  Optional<List<SpecimenDefinition_Additive>> additive();

  Optional<String> preparation();

  Optional<CodeableConcept> cap();

  static ImmutableSpecimenDefinition_Container.Builder builder() {
    return ImmutableSpecimenDefinition_Container.builder();
  }
}
