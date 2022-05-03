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
  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> basedOn();

  Optional<Code> intent();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> supportingInfo();

  Optional<List<CarePlan_Activity>> activity();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> goal();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> careTeam();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Id> id();

  Optional<String> description();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> addresses();

  Reference subject();

  Optional<Period> period();

  Optional<List<Reference>> replaces();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Code> status();

  Optional<Reference> encounter();

  Optional<DateTime> created();

  Optional<List<Reference>> contributor();

  Optional<List<Uri>> instantiatesUri();

  Optional<String> title();

  Optional<Code> language();

  Optional<Reference> author();

  static ImmutableCarePlan.ResourceTypeBuildStage builder() {
    return ImmutableCarePlan.builder();
  }
}
