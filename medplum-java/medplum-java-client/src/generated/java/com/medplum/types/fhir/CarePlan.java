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
    as = ImmutableCarePlan.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CarePlan {
  Optional<List<Extension>> extension();

  Optional<Code> intent();

  Optional<Period> period();

  Optional<List<Reference>> addresses();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> supportingInfo();

  String resourceType();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Code> status();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> contributor();

  Optional<List<Reference>> careTeam();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<CarePlan_Activity>> activity();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> goal();

  Optional<Reference> encounter();

  Optional<List<Reference>> replaces();

  Optional<Narrative> text();

  Optional<String> title();

  Optional<List<CodeableConcept>> category();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> created();

  Optional<List<Annotation>> note();

  Optional<Id> id();

  Reference subject();

  Optional<Reference> author();

  Optional<String> description();

  static ImmutableCarePlan.ResourceTypeBuildStage builder() {
    return ImmutableCarePlan.builder();
  }
}
