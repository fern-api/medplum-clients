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
  String resourceType();

  Optional<Reference> encounter();

  Reference subject();

  Optional<String> title();

  Optional<Code> intent();

  Optional<List<Identifier>> identifier();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<DateTime> created();

  Optional<List<CodeableConcept>> category();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> contributor();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<String> description();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> replaces();

  Optional<List<Reference>> goal();

  Optional<List<Reference>> addresses();

  Optional<List<Uri>> instantiatesUri();

  Optional<Period> period();

  Optional<List<Reference>> careTeam();

  Optional<List<Reference>> supportingInfo();

  Optional<List<CarePlan_Activity>> activity();

  Optional<Reference> author();

  Optional<Code> status();

  static ImmutableCarePlan.ResourceTypeBuildStage builder() {
    return ImmutableCarePlan.builder();
  }
}
