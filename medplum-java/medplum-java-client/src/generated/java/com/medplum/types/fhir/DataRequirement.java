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
    as = ImmutableDataRequirement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement {
  Optional<List<Canonical>> profile();

  Optional<PositiveInt> limit();

  Optional<List<String>> mustSupport();

  Optional<Code> type();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Reference> subjectReference();

  Optional<List<DataRequirement_Sort>> sort();

  Optional<List<DataRequirement_CodeFilter>> codeFilter();

  Optional<List<DataRequirement_DateFilter>> dateFilter();

  Optional<String> id();

  static ImmutableDataRequirement.Builder builder() {
    return ImmutableDataRequirement.builder();
  }
}
