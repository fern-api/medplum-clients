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
    as = ImmutableCarePlan_Activity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CarePlan_Activity {
  Optional<Reference> reference();

  Optional<List<Annotation>> progress();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> outcomeCodeableConcept();

  Optional<List<Reference>> outcomeReference();

  Optional<CarePlan_Detail> detail();

  static ImmutableCarePlan_Activity.Builder builder() {
    return ImmutableCarePlan_Activity.builder();
  }
}
