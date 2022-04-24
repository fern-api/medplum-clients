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
    as = ImmutableCarePlan.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CarePlan {
  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<Period> period();

  Optional<code> status();

  Optional<List<Identifier>> identifier();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> addresses();

  Optional<Narrative> text();

  Optional<List<Reference>> replaces();

  Optional<String> title();

  Reference subject();

  Optional<String> description();

  Optional<Reference> author();

  Optional<List<Extension>> extension();

  Optional<dateTime> created();

  Optional<List<Reference>> basedOn();

  String resourceType();

  Optional<List<Reference>> supportingInfo();

  Optional<code> language();

  Optional<List<uri>> instantiatesUri();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> careTeam();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<List<CarePlan_Activity>> activity();

  Optional<Reference> encounter();

  Optional<code> intent();

  Optional<List<Reference>> contributor();

  Optional<List<Reference>> goal();

  Optional<List<Reference>> partOf();

  Optional<List<CodeableConcept>> category();

  Optional<id> id();

  static ImmutableCarePlan.SubjectBuildStage builder() {
    return ImmutableCarePlan.builder();
  }
}
