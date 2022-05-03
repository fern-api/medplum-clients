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
  Optional<CodeableConcept> cap();

  Optional<CodeableConcept> material();

  Optional<List<Extension>> extension();

  Optional<List<SpecimenDefinition_Additive>> additive();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Quantity> capacity();

  Optional<String> preparation();

  Optional<String> minimumVolumeString();

  Optional<String> id();

  Optional<Quantity> minimumVolumeQuantity();

  static ImmutableSpecimenDefinition_Container.Builder builder() {
    return ImmutableSpecimenDefinition_Container.builder();
  }
}
