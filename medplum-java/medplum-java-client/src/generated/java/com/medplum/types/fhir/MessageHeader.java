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
  Optional<Reference> enterer();

  Optional<Id> id();

  Optional<Reference> sender();

  Optional<MessageHeader_Response> response();

  MessageHeader_Source source();

  String resourceType();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> focus();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<MessageHeader_Destination>> destination();

  Optional<Canonical> definition();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> reason();

  Optional<Narrative> text();

  Optional<Reference> responsible();

  Optional<Reference> author();

  Optional<Coding> eventCoding();

  Optional<String> eventUri();

  static ImmutableMessageHeader.SourceBuildStage builder() {
    return ImmutableMessageHeader.builder();
  }
}
