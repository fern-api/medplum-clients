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
  Optional<Boolean> active();

  String resourceType();

  Optional<String> name();

  Optional<List<Group_Characteristic>> characteristic();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<GroupType> type();

  Optional<Narrative> text();

  Optional<Boolean> actual();

  Optional<CodeableConcept> code();

  Optional<Reference> managingEntity();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<UnsignedInt> quantity();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Group_Member>> member();

  static ImmutableGroup.ResourceTypeBuildStage builder() {
    return ImmutableGroup.builder();
  }
}
