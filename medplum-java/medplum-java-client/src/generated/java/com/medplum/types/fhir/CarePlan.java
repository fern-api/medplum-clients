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
  Optional<List<Reference>> replaces();

  Optional<List<Annotation>> note();

  Optional<Reference> encounter();

  Optional<Code> language();

  Optional<Reference> author();

  Optional<List<Reference>> partOf();

  Optional<List<CarePlan_Activity>> activity();

  Optional<List<Reference>> basedOn();

  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> status();

  Optional<Period> period();

  Optional<List<Reference>> careTeam();

  Optional<String> description();

  Optional<List<CodeableConcept>> category();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<DateTime> created();

  Optional<List<Reference>> contributor();

  Optional<List<Reference>> goal();

  Optional<Narrative> text();

  Optional<List<Reference>> addresses();

  Reference subject();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> supportingInfo();

  String resourceType();

  Optional<Code> intent();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  static ImmutableCarePlan.SubjectBuildStage builder() {
    return ImmutableCarePlan.builder();
  }
}
