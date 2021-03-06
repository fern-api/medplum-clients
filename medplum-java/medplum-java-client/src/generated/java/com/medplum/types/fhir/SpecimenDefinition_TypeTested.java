package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> requirement();

  Optional<List<SpecimenDefinition_Handling>> handling();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Specimendefinition_typetestedPreference> preference();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Boolean> isDerived();

  Optional<SpecimenDefinition_Container> container();

  Optional<List<CodeableConcept>> rejectionCriterion();

  Optional<Duration> retentionTime();

  static ImmutableSpecimenDefinition_TypeTested.Builder builder() {
    return ImmutableSpecimenDefinition_TypeTested.builder();
  }
}
