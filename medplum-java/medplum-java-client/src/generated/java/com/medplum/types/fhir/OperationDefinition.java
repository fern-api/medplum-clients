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
  Optional<List<ContactDetail>> contact();

  Optional<List<UsageContext>> useContext();

  Optional<Boolean> type();

  Optional<List<OperationDefinition_Overload>> overload();

  Optional<Markdown> description();

  Optional<Canonical> inputProfile();

  Optional<Boolean> affectsState();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<String> name();

  Optional<List<Code>> resource();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Boolean> instance();

  String resourceType();

  Optional<Canonical> outputProfile();

  Optional<Boolean> experimental();

  Optional<Uri> url();

  Optional<Markdown> purpose();

  Optional<String> publisher();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<Code> code();

  Optional<DateTime> date();

  Optional<Markdown> comment();

  Optional<Uri> implicitRules();

  Optional<OperationdefinitionKind> kind();

  Optional<Canonical> base();

  Optional<List<OperationDefinition_Parameter>> parameter();

  Optional<String> version();

  Optional<OperationdefinitionStatus> status();

  Optional<Boolean> system();

  Optional<List<CodeableConcept>> jurisdiction();

  static ImmutableOperationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableOperationDefinition.builder();
  }
}
