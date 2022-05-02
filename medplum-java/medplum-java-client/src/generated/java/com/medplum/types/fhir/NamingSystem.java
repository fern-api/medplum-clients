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
    as = ImmutableNamingSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NamingSystem {
  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> contact();

  Optional<Code> language();

  Optional<String> usage();

  Optional<Uri> implicitRules();

  Optional<Markdown> description();

  Optional<Narrative> text();

  Optional<NamingsystemKind> kind();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> publisher();

  Optional<String> responsible();

  Optional<List<Extension>> extension();

  Optional<NamingsystemStatus> status();

  Optional<String> name();

  Optional<List<ResourceList>> contained();

  List<NamingSystem_UniqueId> uniqueId();

  Optional<CodeableConcept> type();

  String resourceType();

  Optional<DateTime> date();

  static ImmutableNamingSystem.ResourceTypeBuildStage builder() {
    return ImmutableNamingSystem.builder();
  }
}
