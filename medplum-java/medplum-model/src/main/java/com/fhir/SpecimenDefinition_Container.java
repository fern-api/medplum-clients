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
    as = ImmutableSpecimenDefinition_Container.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition_Container {
  Optional<String> id();

  Optional<String> preparation();

  Optional<List<SpecimenDefinition_Additive>> additive();

  Optional<CodeableConcept> cap();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> capacity();

  Optional<CodeableConcept> type();

  Optional<String> minimumVolumeString();

  Optional<CodeableConcept> material();

  Optional<Quantity> minimumVolumeQuantity();

  Optional<List<Extension>> extension();

  static ImmutableSpecimenDefinition_Container.Builder builder() {
    return ImmutableSpecimenDefinition_Container.builder();
  }
}
