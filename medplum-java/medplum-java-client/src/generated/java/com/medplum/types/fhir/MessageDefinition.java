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
    as = ImmutableMessageDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageDefinition {
  Optional<Markdown> copyright();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Canonical>> parent();

  Optional<List<Extension>> extension();

  Optional<Uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  Optional<String> version();

  Optional<Boolean> experimental();

  Optional<String> name();

  Optional<String> title();

  Optional<MessagedefinitionResponserequired> responseRequired();

  Optional<Markdown> purpose();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<MessageDefinition_AllowedResponse>> allowedResponse();

  Optional<MessagedefinitionStatus> status();

  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  Optional<Markdown> description();

  Optional<List<UsageContext>> useContext();

  Optional<Coding> eventCoding();

  Optional<Id> id();

  Optional<List<Canonical>> replaces();

  Optional<List<ResourceList>> contained();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<Canonical> base();

  Optional<MessagedefinitionCategory> category();

  Optional<List<MessageDefinition_Focus>> focus();

  Optional<Code> language();

  Optional<String> eventUri();

  Optional<List<Canonical>> graph();

  static ImmutableMessageDefinition.ResourceTypeBuildStage builder() {
    return ImmutableMessageDefinition.builder();
  }
}
