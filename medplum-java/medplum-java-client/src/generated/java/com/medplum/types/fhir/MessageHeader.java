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
    as = ImmutableMessageHeader.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader {
  Optional<Canonical> definition();

  Optional<Coding> eventCoding();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Reference> author();

  MessageHeader_Source source();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<MessageHeader_Destination>> destination();

  String resourceType();

  Optional<CodeableConcept> reason();

  Optional<Narrative> text();

  Optional<String> eventUri();

  Optional<Reference> responsible();

  Optional<Reference> enterer();

  Optional<MessageHeader_Response> response();

  Optional<List<Reference>> focus();

  Optional<Reference> sender();

  Optional<Code> language();

  static ImmutableMessageHeader.SourceBuildStage builder() {
    return ImmutableMessageHeader.builder();
  }
}
