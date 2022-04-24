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
    as = ImmutableMessageHeader.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader {
  Optional<Reference> author();

  MessageHeader_Source source();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<canonical> definition();

  Optional<Narrative> text();

  Optional<String> eventUri();

  Optional<List<MessageHeader_Destination>> destination();

  Optional<Reference> sender();

  Optional<code> language();

  Optional<Coding> eventCoding();

  Optional<uri> implicitRules();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Reference> enterer();

  Optional<CodeableConcept> reason();

  Optional<MessageHeader_Response> response();

  Optional<List<Reference>> focus();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<Reference> responsible();

  static ImmutableMessageHeader.SourceBuildStage builder() {
    return ImmutableMessageHeader.builder();
  }
}
