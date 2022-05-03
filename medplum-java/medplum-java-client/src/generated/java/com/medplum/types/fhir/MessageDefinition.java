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
  Optional<String> title();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> experimental();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<MessagedefinitionResponserequired> responseRequired();

  String resourceType();

  Optional<Markdown> copyright();

  Optional<List<MessageDefinition_AllowedResponse>> allowedResponse();

  Optional<Markdown> purpose();

  Optional<String> publisher();

  Optional<Markdown> description();

  Optional<List<Canonical>> parent();

  Optional<List<UsageContext>> useContext();

  Optional<List<Canonical>> replaces();

  Optional<List<MessageDefinition_Focus>> focus();

  Optional<String> name();

  Optional<MessagedefinitionCategory> category();

  Optional<List<Identifier>> identifier();

  Optional<String> version();

  Optional<MessagedefinitionStatus> status();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Canonical> base();

  Optional<Code> language();

  Optional<Uri> url();

  Optional<DateTime> date();

  Optional<Coding> eventCoding();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<String> eventUri();

  Optional<List<Canonical>> graph();

  static ImmutableMessageDefinition.ResourceTypeBuildStage builder() {
    return ImmutableMessageDefinition.builder();
  }
}
