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
    as = ImmutableOperationDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition {
  Optional<List<UsageContext>> useContext();

  Optional<DateTime> date();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<Boolean> experimental();

  Optional<List<OperationDefinition_Overload>> overload();

  Optional<List<Code>> resource();

  Optional<Code> code();

  Optional<Boolean> type();

  Optional<List<OperationDefinition_Parameter>> parameter();

  Optional<String> title();

  Optional<Canonical> base();

  Optional<Boolean> system();

  Optional<OperationdefinitionKind> kind();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Boolean> instance();

  Optional<Markdown> description();

  Optional<Markdown> purpose();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<Markdown> comment();

  Optional<OperationdefinitionStatus> status();

  Optional<Boolean> affectsState();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> contact();

  Optional<String> version();

  Optional<List<CodeableConcept>> jurisdiction();

  String resourceType();

  Optional<Canonical> inputProfile();

  Optional<Canonical> outputProfile();

  Optional<Uri> url();

  static ImmutableOperationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableOperationDefinition.builder();
  }
}
