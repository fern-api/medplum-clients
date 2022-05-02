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
  Optional<Boolean> experimental();

  Optional<MessagedefinitionResponserequired> responseRequired();

  Optional<Uri> implicitRules();

  Optional<Coding> eventCoding();

  Optional<List<MessageDefinition_Focus>> focus();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<Markdown> description();

  Optional<String> title();

  Optional<Markdown> purpose();

  Optional<String> version();

  Optional<MessagedefinitionCategory> category();

  Optional<DateTime> date();

  Optional<String> eventUri();

  Optional<List<Canonical>> replaces();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<ResourceList>> contained();

  Optional<MessagedefinitionStatus> status();

  Optional<Uri> url();

  Optional<Markdown> copyright();

  Optional<Id> id();

  String resourceType();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Canonical>> graph();

  Optional<Canonical> base();

  Optional<List<MessageDefinition_AllowedResponse>> allowedResponse();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> parent();

  Optional<String> publisher();

  Optional<List<ContactDetail>> contact();

  Optional<List<UsageContext>> useContext();

  static ImmutableMessageDefinition.ResourceTypeBuildStage builder() {
    return ImmutableMessageDefinition.builder();
  }
}
