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
    as = ImmutableCarePlan_Activity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CarePlan_Activity {
  Optional<String> id();

  Optional<List<CodeableConcept>> outcomeCodeableConcept();

  Optional<List<Annotation>> progress();

  Optional<Reference> reference();

  Optional<CarePlan_Detail> detail();

  Optional<List<Reference>> outcomeReference();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableCarePlan_Activity.Builder builder() {
    return ImmutableCarePlan_Activity.builder();
  }
}
