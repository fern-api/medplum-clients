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
    as = ImmutableGroup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Group {
  Optional<String> name();

  Optional<Boolean> active();

  Optional<List<Group_Characteristic>> characteristic();

  Optional<CodeableConcept> code();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> implicitRules();

  Optional<code> language();

  Optional<Narrative> text();

  Optional<Boolean> actual();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<List<Group_Member>> member();

  Optional<GroupType> type();

  Optional<Reference> managingEntity();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<unsignedInt> quantity();

  static ImmutableGroup.ResourceTypeBuildStage builder() {
    return ImmutableGroup.builder();
  }
}
