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
  Optional<Markdown> purpose();

  Optional<String> name();

  Optional<List<Identifier>> identifier();

  Optional<List<Canonical>> graph();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<List<ResourceList>> contained();

  Optional<List<UsageContext>> useContext();

  Optional<List<Canonical>> parent();

  Optional<Coding> eventCoding();

  Optional<String> eventUri();

  Optional<MessagedefinitionStatus> status();

  Optional<List<ContactDetail>> contact();

  Optional<Id> id();

  Optional<DateTime> date();

  Optional<List<MessageDefinition_Focus>> focus();

  Optional<Boolean> experimental();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Canonical>> replaces();

  Optional<Uri> implicitRules();

  Optional<Markdown> copyright();

  String resourceType();

  Optional<MessagedefinitionCategory> category();

  Optional<Canonical> base();

  Optional<MessagedefinitionResponserequired> responseRequired();

  Optional<Uri> url();

  Optional<String> version();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Markdown> description();

  Optional<Narrative> text();

  Optional<List<MessageDefinition_AllowedResponse>> allowedResponse();

  Optional<String> publisher();

  static ImmutableMessageDefinition.ResourceTypeBuildStage builder() {
    return ImmutableMessageDefinition.builder();
  }
}
