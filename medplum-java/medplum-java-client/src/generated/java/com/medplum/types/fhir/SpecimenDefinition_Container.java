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
  Optional<String> minimumVolumeString();

  Optional<CodeableConcept> material();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Quantity> capacity();

  Optional<String> id();

  Optional<Quantity> minimumVolumeQuantity();

  Optional<CodeableConcept> cap();

  Optional<List<SpecimenDefinition_Additive>> additive();

  Optional<String> description();

  Optional<String> preparation();

  static ImmutableSpecimenDefinition_Container.Builder builder() {
    return ImmutableSpecimenDefinition_Container.builder();
  }
}
