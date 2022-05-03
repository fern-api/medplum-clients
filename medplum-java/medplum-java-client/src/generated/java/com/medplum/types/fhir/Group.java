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
    as = ImmutableGroup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Group {
  String resourceType();

  Optional<List<Group_Characteristic>> characteristic();

  Optional<UnsignedInt> quantity();

  Optional<List<ResourceList>> contained();

  Optional<Reference> managingEntity();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<Group_Member>> member();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Boolean> active();

  Optional<GroupType> type();

  Optional<CodeableConcept> code();

  Optional<Boolean> actual();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<String> name();

  static ImmutableGroup.ResourceTypeBuildStage builder() {
    return ImmutableGroup.builder();
  }
}
