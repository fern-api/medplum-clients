package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSpecimenDefinition_TypeTested.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition_TypeTested {
  Optional<CodeableConcept> type();

  Optional<SpecimenDefinition_Container> container();

  Optional<Duration> retentionTime();

  Optional<Specimendefinition_typetestedPreference> preference();

  Optional<List<CodeableConcept>> rejectionCriterion();

  Optional<String> id();

  Optional<String> requirement();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Boolean> isDerived();

  Optional<List<SpecimenDefinition_Handling>> handling();

  static ImmutableSpecimenDefinition_TypeTested.Builder builder() {
    return ImmutableSpecimenDefinition_TypeTested.builder();
  }
}
