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
    as = ImmutableImplementationGuide.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide {
  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Boolean> experimental();

  Optional<Uri> url();

  Optional<Markdown> copyright();

  Optional<Id> packageId();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> contact();

  Optional<String> publisher();

  Optional<String> title();

  Optional<String> version();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<ImplementationguideStatus> status();

  Optional<Narrative> text();

  Optional<ImplementationGuide_Manifest> manifest();

  Optional<List<ImplementationGuide_Global>> global();

  Optional<ImplementationguideLicense> license();

  Optional<List<ImplementationGuide_DependsOn>> dependsOn();

  Optional<DateTime> date();

  String resourceType();

  Optional<List<ImplementationguideFhirversionItem>> fhirVersion();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<UsageContext>> useContext();

  Optional<ImplementationGuide_Definition> definition();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  static ImmutableImplementationGuide.ResourceTypeBuildStage builder() {
    return ImmutableImplementationGuide.builder();
  }
}
