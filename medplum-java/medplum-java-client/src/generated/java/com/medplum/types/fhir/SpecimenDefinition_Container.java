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
  Optional<CodeableConcept> type();

  Optional<List<SpecimenDefinition_Additive>> additive();

  Optional<Quantity> capacity();

  Optional<String> id();

  Optional<String> preparation();

  Optional<Quantity> minimumVolumeQuantity();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> material();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<CodeableConcept> cap();

  Optional<String> minimumVolumeString();

  static ImmutableSpecimenDefinition_Container.Builder builder() {
    return ImmutableSpecimenDefinition_Container.builder();
  }
}
