package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DetectedIssue_Mitigation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDetectedIssue_Mitigation.builder()}.
 */
@Generated(from = "DetectedIssue_Mitigation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDetectedIssue_Mitigation
    implements DetectedIssue_Mitigation {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final CodeableConcept action;
  private final @Nullable DateTime date;
  private final @Nullable Reference author;

  private ImmutableDetectedIssue_Mitigation(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      CodeableConcept action,
      @Nullable DateTime date,
      @Nullable Reference author) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.action = action;
    this.date = date;
    this.author = author;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public CodeableConcept action() {
    return action;
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Mitigation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Mitigation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDetectedIssue_Mitigation(newValue, this.modifierExtension, this.id, this.action, this.date, this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Mitigation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Mitigation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDetectedIssue_Mitigation(value, this.modifierExtension, this.id, this.action, this.date, this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Mitigation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Mitigation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, newValue, this.id, this.action, this.date, this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Mitigation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Mitigation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, value, this.id, this.action, this.date, this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Mitigation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Mitigation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, this.modifierExtension, newValue, this.action, this.date, this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Mitigation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Mitigation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, this.modifierExtension, value, this.action, this.date, this.author);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DetectedIssue_Mitigation#action() action} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for action
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDetectedIssue_Mitigation withAction(CodeableConcept value) {
    if (this.action == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "action");
    return new ImmutableDetectedIssue_Mitigation(this.extension, this.modifierExtension, this.id, newValue, this.date, this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Mitigation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Mitigation withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, this.modifierExtension, this.id, this.action, newValue, this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Mitigation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Mitigation withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, this.modifierExtension, this.id, this.action, value, this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Mitigation#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Mitigation withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, this.modifierExtension, this.id, this.action, this.date, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Mitigation#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Mitigation withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableDetectedIssue_Mitigation(this.extension, this.modifierExtension, this.id, this.action, this.date, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDetectedIssue_Mitigation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDetectedIssue_Mitigation
        && equalTo((ImmutableDetectedIssue_Mitigation) another);
  }

  private boolean equalTo(ImmutableDetectedIssue_Mitigation another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && action.equals(another.action)
        && Objects.equals(date, another.date)
        && Objects.equals(author, another.author);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code id}, {@code action}, {@code date}, {@code author}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + action.hashCode();
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(author);
    return h;
  }

  /**
   * Prints the immutable value {@code DetectedIssue_Mitigation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DetectedIssue_Mitigation{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("action=").append(action);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DetectedIssue_Mitigation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DetectedIssue_Mitigation {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept action;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(CodeableConcept action) {
      this.action = action;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDetectedIssue_Mitigation fromJson(Json json) {
    ImmutableDetectedIssue_Mitigation.Builder builder = ((ImmutableDetectedIssue_Mitigation.Builder) ImmutableDetectedIssue_Mitigation.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.action != null) {
      builder.action(json.action);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    return (ImmutableDetectedIssue_Mitigation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DetectedIssue_Mitigation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DetectedIssue_Mitigation instance
   */
  public static DetectedIssue_Mitigation copyOf(DetectedIssue_Mitigation instance) {
    if (instance instanceof ImmutableDetectedIssue_Mitigation) {
      return (ImmutableDetectedIssue_Mitigation) instance;
    }
    return ((ImmutableDetectedIssue_Mitigation.Builder) ImmutableDetectedIssue_Mitigation.builder())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .action(instance.action())
        .date(instance.date())
        .author(instance.author())
        .build();
  }

  /**
   * Creates a builder for {@link DetectedIssue_Mitigation DetectedIssue_Mitigation}.
   * <pre>
   * ImmutableDetectedIssue_Mitigation.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DetectedIssue_Mitigation#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DetectedIssue_Mitigation#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link DetectedIssue_Mitigation#id() id}
   *    .action(com.medplum.types.fhir.CodeableConcept) // required {@link DetectedIssue_Mitigation#action() action}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link DetectedIssue_Mitigation#date() date}
   *    .author(com.medplum.types.fhir.Reference) // optional {@link DetectedIssue_Mitigation#author() author}
   *    .build();
   * </pre>
   * @return A new DetectedIssue_Mitigation builder
   */
  public static ActionBuildStage builder() {
    return new ImmutableDetectedIssue_Mitigation.Builder();
  }

  /**
   * Builds instances of type {@link DetectedIssue_Mitigation DetectedIssue_Mitigation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DetectedIssue_Mitigation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ActionBuildStage, BuildFinal {
    private static final long INIT_BIT_ACTION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_DATE = 0x8L;
    private static final long OPT_BIT_AUTHOR = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept action;
    private @Nullable DateTime date;
    private @Nullable Reference author;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link DetectedIssue_Mitigation#action() action} attribute.
     * @param action The value for action 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(CodeableConcept action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      initBits &= ~INIT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Builds a new {@link DetectedIssue_Mitigation DetectedIssue_Mitigation}.
     * @return An immutable instance of DetectedIssue_Mitigation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DetectedIssue_Mitigation build() {
      checkRequiredAttributes();
      return new ImmutableDetectedIssue_Mitigation(extension, modifierExtension, id, action, date, author);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean actionIsSet() {
      return (initBits & INIT_BIT_ACTION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DetectedIssue_Mitigation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!actionIsSet()) attributes.add("action");
      return "Cannot build DetectedIssue_Mitigation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DetectedIssue_Mitigation", generator = "Immutables")
  public interface ActionBuildStage {
    /**
     * Initializes the value for the {@link DetectedIssue_Mitigation#action() action} attribute.
     * @param action The value for action 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(CodeableConcept action);
  }

  @Generated(from = "DetectedIssue_Mitigation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link DetectedIssue_Mitigation#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Builds a new {@link DetectedIssue_Mitigation DetectedIssue_Mitigation}.
     * @return An immutable instance of DetectedIssue_Mitigation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DetectedIssue_Mitigation build();
  }
}
